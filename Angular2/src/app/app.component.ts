import { Component } from '@angular/core';
import { ListItemComponent } from './list-item/list-item.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'This is my First Apps';
  countries : any[];
  constructor()
  /*{
  	this.countries=['USA','CHINA','INDIA','RUSSIA'];
  }*/
  {
  	this.countries = [{
  			name : "INDIA",
  			population:"150"
  		},{
  			name:"America",
  			population:"70"
  	}]
  }

  changeData(){
  	this.countries[0].name="Mexico";
  	this.countries[1].name="Europe";
  }
}