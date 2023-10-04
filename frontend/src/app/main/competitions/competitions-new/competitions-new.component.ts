import { Component, OnInit, ViewChild  } from '@angular/core';
import { OComboComponent, OTextInputComponent } from 'ontimize-web-ngx';

@Component({
  selector: 'app-new_competition',
  templateUrl: './competitions-new.component.html',
  styleUrls: ['./competitions-new.component.css']
})
export class CompetitionsNewComponent implements OnInit {

  @ViewChild('type_combo', {static:true}) type_combo: OComboComponent;
  @ViewChild('league_code', {static:false}) league_code: OTextInputComponent;

  public isPrivate: boolean = false;

  public staticData = [{
    value: true,
    name: "PUBLIC"
  }, {
    value: false,
    name: "PRIVATE"
  }];

  public texto: string = this.asignarVar();

  constructor() {
   }

  ngOnInit() {
  }

  asignarVar(): string{
    const date = new Date();
    let varia:string = `${date}-${"nombreUsuario"}`;
    return varia;
  }

  changeType() {
    if(this.type_combo.getValue()===false){
      this.isPrivate=true;
      this.league_code.setValue(this.texto);
    } else{
      this.isPrivate=false;
      this.league_code.setValue("");
    }
  }


}
