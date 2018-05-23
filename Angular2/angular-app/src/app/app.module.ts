import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { PlayersComponent } from './players/players.component';
import { HighlightDirective } from './highlight.directive';
import { PipexComponent } from './pipex.component';
import { StarsPipe } from './stars.pipe';


@NgModule({
  declarations: [AppComponent, PlayersComponent, HighlightDirective, PipexComponent, StarsPipe],
  imports: [ BrowserModule,FormsModule],
  providers: [],
  bootstrap: [PlayersComponent]
})

export class AppModule { }
