import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent {
  customers : any;
  constructor(private http:HttpClient){}
  ngOnInit() : void{
    this.http.get("http://localhost:8889/customer-service/customers?projection=fullCustomer").subscribe({
      next : (data : Object) => {
        this.customers=data;
      },
      error : (err) => {
    
      }
    });
  }
}
