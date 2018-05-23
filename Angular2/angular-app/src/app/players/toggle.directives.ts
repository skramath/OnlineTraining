import { Directive, HostBinding, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appToggle]'
})
export class ToggleButtonDirective {

  @HostBinding('class.selected')
      private hostSelected = false;
  

  @HostListener('click')
  private onClick() {
    console.log("Clicked")
    this.hostSelected = !this.hostSelected;
  }
}