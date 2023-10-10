import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompetitionsHomeComponent } from './competitions-home/competitions-home.component';
import { CompetitionsDetailComponent } from './competitions-detail/competitions-detail.component';
import { CompetitionsAvailableComponent } from './competitions-available/competitions-available.component';
import { CompetitionsSearchComponent } from './competitions-search/competitions-search.component';


const routes: Routes = [{
  path: 'home',
  component: CompetitionsHomeComponent
},
{
  path: 'available',
  component: CompetitionsAvailableComponent
}
,
{
  path: 'search',
  component: CompetitionsSearchComponent
}
,
{
  path: 'available/:COMP_ID',
  component: CompetitionsDetailComponent
}
,
{
  path: 'home/:COMP_ID',
  component: CompetitionsDetailComponent
}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CompetitionsRoutingModule { }
