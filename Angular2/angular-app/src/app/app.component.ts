import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  //template: '<h1>Hello {{name}} </h1> <div id="box">Angular Training</div>',
  templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Gladiators Cricket Team';
  name = 'sarath'; 
}
