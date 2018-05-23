import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header.component';
import { RecipelistComponent } from './recipelist/recipelist.component';
import { RecipelistitemComponent } from './recipelist/recipelistitem.component';
import { RecipedetailComponent } from './recipedetail/recipedetail.component';
import { RecipeComponent } from './recipe.component';
import { ShopingcartComponent } from './shopingcart/shopingcart.component';
import { FooterComponent } from './footer.component';
import { MainComponent } from './main.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RecipelistComponent,
    RecipelistitemComponent,
    RecipedetailComponent,
    RecipeComponent,
    ShopingcartComponent,
    FooterComponent,
    MainComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [MainComponent]
})
export class AppModule { }
