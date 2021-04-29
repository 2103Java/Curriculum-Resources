import { TestBed } from '@angular/core/testing';

import { RouteguardGuard } from './routeguard.guard';

describe('RouteguardGuard', () => {
  let guard: RouteguardGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(RouteguardGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
