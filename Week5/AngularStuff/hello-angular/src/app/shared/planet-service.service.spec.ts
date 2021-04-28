import { TestBed } from '@angular/core/testing';

import { PlanetServiceService } from './planet-service.service';

describe('PlanetServiceService', () => {
  let service: PlanetServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlanetServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
