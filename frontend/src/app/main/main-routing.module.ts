import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from 'ontimize-web-ngx';

import { MainComponent } from './main.component';

export const routes: Routes = [
  {
    path: '',
    component: MainComponent,
    canActivate: [AuthGuardService],
    children: [
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', loadChildren: () => import('./home/home.module').then(m => m.HomeModule) },
      { path: 'new', loadChildren: () => import('./competitions/competitions.module').then(m => m.CompetitionsModule) },
      { path: 'competitions', loadChildren: () => import('./competitions/competitions.module').then(m => m.CompetitionsModule) },
      { path: 'search', loadChildren: () => import('./competitions/competitions.module').then(m => m.CompetitionsModule) }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainRoutingModule { }
