import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'prependpipe'
})
export class PrependpipePipe implements PipeTransform {

  /**
   * Why do we use pipes? 
   *    They exist 
   *    They don't modify the underlying data - just format the view. Very useful to have if 
   *    multiple components rely on the same data. 
   */

  transform( param1: string, param2: string){

    /**
     * you can put some fancy logic but I'm simply appending to the string. 
     */

    return param2.concat(param1);
  }

}
