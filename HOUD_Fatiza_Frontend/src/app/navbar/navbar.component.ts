import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private router: Router) { } // Correction ici : router doit être un attribut de classe

  ngOnInit(): void {
  }
  
  isActive(route: string): boolean {
    return this.router.isActive(route, true);
  }
}
