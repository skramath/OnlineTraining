import { Component, OnInit,Input } from '@angular/core';
import {Recipe} from "../recipe"
@Component({
  selector: 'app-recipedetail',
  templateUrl: './recipedetail.component.html',
  styleUrls: ['./recipedetail.component.css']
})
export class RecipedetailComponent implements OnInit {
 @Input() selectedReceipe : Recipe;

 constructor() { }

  ngOnInit() {
  }

}
