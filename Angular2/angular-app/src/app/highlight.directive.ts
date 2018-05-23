import { Directive, ElementRef,Renderer } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(private element:ElementRef,private rend:Renderer) {
      //this.element.nativeElement.style.backgroundColor = "red";     
      this.rend.setElementStyle(this.element.nativeElement,'backgroundColor','green');
   }

}
