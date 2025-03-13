import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuBarComponent } from './common/menu-bar/menu-bar.component';
import { HomeComponent } from './pages/home/home.component';
import { WorkoutListComponent } from './pages/workout-list/workout-list.component';
import { WorkoutPlansComponent } from './pages/workout-plans/workout-plans.component';
import { LoginComponent } from './common/login/login.component';
import { FormsModule } from '@angular/forms';
import { CalculatorsComponent } from './pages/calculators/calculators.component';
import { FooterComponent } from './common/footer/footer.component';
import { ChestComponent } from './pages/workout-list/chest/chest.component';
import { TricepsComponent } from './pages/workout-list/triceps/triceps.component';
import { BackComponent } from './pages/workout-list/back/back.component';
import { BicepsComponent } from './pages/workout-list/biceps/biceps.component';
import { ShouldersComponent } from './pages/workout-list/shoulders/shoulders.component';
import { AbsComponent } from './pages/workout-list/abs/abs.component';
import { CardioComponent } from './pages/workout-list/cardio/cardio.component';
import { LegsComponent } from './pages/workout-list/legs/legs.component';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    MenuBarComponent,
    HomeComponent,
    WorkoutListComponent,
    WorkoutPlansComponent,
    LoginComponent,
    CalculatorsComponent,
    FooterComponent,
    ChestComponent,
    TricepsComponent,
    BackComponent,
    BicepsComponent,
    ShouldersComponent,
    AbsComponent,
    CardioComponent,
    LegsComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
