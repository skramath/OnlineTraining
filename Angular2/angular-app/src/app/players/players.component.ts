import { Component, OnInit } from '@angular/core';
import {AppComponent} from '../app.component';
@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent {

 teamName = 'Gladiator Cricket Team';
 players:string[] = ["Sarath","Nikil","Partibhan","Abbas","Kunal"];
 
 addPlayer(pName):void{
   console.log("Adding new Player :"+pName);
   this.players.push(pName);
  }

  removePlayer(pName):void{
    this.players.pop();
    
  }

}

