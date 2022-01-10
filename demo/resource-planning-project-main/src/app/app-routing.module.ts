import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AuthenticationComponent} from './components/sigin/authentication.component';
import {DashboardComponent} from './components/dashboard/dashboard.component';
import {AuthGuard} from './core/guards/auth.guard';
import {RegisterComponent} from './components/register/register.component';
import {IndexComponent} from './components/index/index.component';

const routes: Routes = [
  { path: '', redirectTo: '/index', pathMatch: 'full' },
  {
    path: 'register',
    component: RegisterComponent,
  },
  {
    path: 'index',
    component: IndexComponent,
  },
  {
    path: 'login',
    component: AuthenticationComponent,
  },
  {
    path: 'dashboard',
    component: DashboardComponent,
    canActivate: [AuthGuard]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
