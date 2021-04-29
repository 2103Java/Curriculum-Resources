import { TestBed } from '@angular/core/testing';

import { AjaxCallService } from './ajax-call.service';

describe('AjaxCallService', () => {
  let service: AjaxCallService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AjaxCallService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
