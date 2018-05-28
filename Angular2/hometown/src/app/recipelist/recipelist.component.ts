import { Component, OnInit, Input, Output,EventEmitter} from '@angular/core';
import {Recipe} from '../recipe';

@Component({
  selector: 'app-recipelist',
  templateUrl: './recipelist.component.html',
  styleUrls: ['./recipelist.component.css']
})
export class RecipelistComponent implements OnInit {
  
  recipes:Recipe[]=[
    new Recipe('Kerala Sadya','Authentic Kerala Sadya','200','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQi9962-DnMcA_ELFNRqdUfph4OTU8uJmILNagfGxgtLpqIWv7R'),
    new Recipe('Beef Chilly','Spicy Beef Chilly','120','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-2uFlePRMIB-Lx44SEKd4AbMJMouQkrzqAFYjSOq-IV7WijR8'),
    new Recipe('Malabar Biriyani','Malabhar Dum Biriyani','250','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSE3J9I1gosnT5UzaoPWIiByBrQ9zddmRBjtoiu0jF5W0DqfxaQ'),
    new Recipe('Kerala Poratta','Made of Soft Plain Flour Dough ','30','https://i.ndtvimg.com/i/2015-03/parota_625x350_71425788503.jpg'),
    new Recipe('Unni Appam','Sweet and Tasty','25','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcST4kTLkeYNDZyn2IgbGTwd39WhcjuxwcmLwq-ic3ggvXVrydF0')
  ];
  constructor() { }

  @Output() recipeSelected = new EventEmitter<Recipe>();

  onSelect(recipe:Recipe){
    this.recipeSelected.emit(recipe);
  }
  
  ngOnInit() {

    

  }
  // sending data to one component to another


}
