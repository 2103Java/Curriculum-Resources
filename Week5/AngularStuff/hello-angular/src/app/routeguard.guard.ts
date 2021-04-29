import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RouteguardGuard implements CanActivate {
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

      /**
       * fancy logic to either allow or stop people getting through!
       * 
       * CanACtivate 
       * CanActivateChild 
       * CanDeactiave
       * Resolve 
       * CanLoad 
       */
    return true;
  }
  
}
