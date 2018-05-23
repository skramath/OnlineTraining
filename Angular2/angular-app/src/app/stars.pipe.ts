import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'starp'
})
export class StarsPipe implements PipeTransform {
  abc:string="";
  transform(value: string, param?: string): string {
    if(param == 'u'){
      value = value.toUpperCase();
    }else if (param == 'l'){
      this.abc = value.toLowerCase();
    }else {
      value = "No Option Found";
    }
    
    return "**************"+value+"**********";
  }

}
