﻿import { Component, OnInit,Input} from '@angular/core';

@Component({
  selector: 'app-list-item',
  templateUrl: './list-item.component.html',
  styleUrls: ['./list-item.component.css']
})
export class ListItemComponent implements OnInit {
  
  @Input() country : any;
  constructor() { 
  	
  	
  }

  findPopulation() {
          this.country.population = 12032;
  }

  ngOnInit() {
  }

}
