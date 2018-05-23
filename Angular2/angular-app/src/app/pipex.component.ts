import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipex',
  templateUrl: './pipex.component.html',
  styleUrls: ['./pipex.component.css']
})
export class PipexComponent implements OnInit {
  tdate:Date = new Date();
  sval:string="Aspire";
  constructor() { }

  ngOnInit() {
  }

}
