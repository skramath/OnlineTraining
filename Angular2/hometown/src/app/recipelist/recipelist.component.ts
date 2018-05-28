import { Component, OnInit, Input, Output,EventEmitter} from '@angular/core';
import {Recipe} from '../recipe';

@Component({
  selector: 'app-recipelist',
  templateUrl: './recipelist.component.html',
  styleUrls: ['./recipelist.component.css']
})
export class RecipelistComponent implements OnInit {
  
  recipes:Recipe[]=[
    new Recipe('Kerala Sadya','Authentic Kerala Sadya','200','https://blog.travelkhana.com/tkblog/wp-content/uploads/sites/2/2017/03/Sadya.png'),
    new Recipe('Beef Chilly','Spicy Beef Chilly','120','http://cdn.subyskitchen.com/wp-content/uploads/2016/04/Beef-Fry1.jpg '),
    new Recipe('Malabar Biriyani','Malabhar Dum Biriyani','250','https://lh6.ggpht.com/_OGMa3JuKVTk/TG8Zw0ADtsI/AAAAAAAAEMg/pne4wXPq0eU/DSC_0323_thumb%5B13%5D.jpg'),
    new Recipe('Kerala Poratta','Made of Soft Plain Flour Dough ','30','https://i.ndtvimg.com/i/2015-03/parota_625x350_71425788503.jpg'),
    new Recipe('Chicken Lollypop','Mouth watering taste','150','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrdchFoKThnHU3r5tocd2uRpd7WQOJmiroxPtH3sGu9-lKWGKI')
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
