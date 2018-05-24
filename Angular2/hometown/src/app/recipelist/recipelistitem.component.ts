import { Component, OnInit,Input } from '@angular/core';
import {Recipe} from '../recipe';
@Component({
  selector: 'app-recipelistitem',
  templateUrl: './recipelistitem.component.html',
  styleUrls: ['./recipelistitem.component.css']
})
export class RecipelistitemComponent implements OnInit {
  @Input() recipe:Recipe;
  
  constructor() {
      
   }

  ngOnInit() {
  }

}
