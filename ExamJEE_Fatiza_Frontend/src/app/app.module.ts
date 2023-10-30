import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

import { HomeComponent } from './home/home.component';
import { AuthComponent } from './auth/auth.component';
import { WalletsComponent } from './wallets/wallets.component';
@NgModule({
  declarations: [
    BrowserModule,
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AuthComponent,
    WalletsComponent
  ],
  imports: [
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
