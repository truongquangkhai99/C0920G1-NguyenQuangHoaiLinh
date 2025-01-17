import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HomeComponent} from './components/home/home.component';
import {LoginComponent} from './components/login/login.component';
import {RegisterComponent} from './components/register/register.component';
import {MaterialModule} from './material.module';
import {NavBarComponent} from './components/nav-bar/nav-bar.component';
import {FooterComponent} from './components/footer/footer.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from '@angular/material/dialog';
import {VerificationEmailComponent} from './components/verification-email/verification-email.component';
import {AuthInterceptor} from './service/AuthInterceptor';
import {SpinnerComponent} from './components/spinner/spinner.component';
import {SpinnerOverlayComponent} from './components/spinner-overlay/spinner-overlay.component';
import {NgxLoadingModule} from 'ngx-loading';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {AdminComponent} from './components/admin/admin.component';
import {InformationAdminComponent} from './components/information-admin/information-admin.component';
import {ChangePasswordAdminComponent} from './components/change-password-admin/change-password-admin.component';
import {DetailUserComponent} from './components/detail-user/detail-user.component';
import {EditUserComponent} from './components/edit-user/edit-user.component';
import {ChangePasswordUserComponent} from './components/change-password-user/change-password-user.component';
import {InformationUserComponent} from './components/information-user/information-user.component';
import {ListPendingTicketComponent} from './components/list-pending-ticket/list-pending-ticket/list-pending-ticket.component';
import {CancelPendingTicketComponent} from './components/list-pending-ticket/cancel-pending-ticket/cancel-pending-ticket.component';
import {SearchPendingTicketComponent} from './components/search-pending-ticket/search-pending-ticket/search-pending-ticket.component';
import {TrangChinhComponent} from './components/report-statistic/bao-cao-thong-ke/trang-chinh/trang-chinh.component';
// tslint:disable-next-line:max-line-length
import {BaoCaoComponentComponent} from './components/report-statistic/bao-cao-thong-ke/bao-cao/bao-cao-component/bao-cao-component.component';
import {TrangChuThongKeComponent} from './components/report-statistic/bao-cao-thong-ke/thong-ke/demo/trang-chu-thong-ke.component';
import {KetQuaComponent} from './components/report-statistic/bao-cao-thong-ke/thong-ke/ket-qua/ket-qua/ket-qua.component';
import {KetQuaTableComponent} from './components/report-statistic/bao-cao-thong-ke/thong-ke/ket-qua/ket-qua-table/ket-qua-table.component';
// tslint:disable-next-line:max-line-length
import {KetQuaSaiLogicComponent} from './components/report-statistic/bao-cao-thong-ke/thong-ke/ket-qua/ket-qua-sai-logic/ket-qua-sai-logic.component';
import {ChartsModule} from 'ng2-charts';
import {ExcelService} from './components/report-statistic/service/excel.service';

import {DeleteTicketComponent} from './components/ticket/delete-ticket/delete-ticket.component';
import {PrintTicketComponent} from './components/ticket/print-ticket/print-ticket.component';
import {ListTicketComponent} from './components/list-ticket/list-ticket.component';

@NgModule({
  declarations: [
    AppComponent,
    // Quân
    HomeComponent, LoginComponent, RegisterComponent, NavBarComponent, FooterComponent, VerificationEmailComponent,
    // Đăngdcvsdacdasc
    ListPendingTicketComponent, CancelPendingTicketComponent, SearchPendingTicketComponent, SpinnerComponent, SpinnerOverlayComponent,
    SpinnerComponent, SpinnerOverlayComponent,
    // Danh
    AdminComponent, InformationAdminComponent, ChangePasswordAdminComponent,
    // Đạt
    DetailUserComponent, EditUserComponent, ChangePasswordUserComponent, InformationUserComponent,

    // Nhật
    TrangChinhComponent, BaoCaoComponentComponent, TrangChuThongKeComponent,
    KetQuaComponent, KetQuaTableComponent, KetQuaSaiLogicComponent,

    // Châu
    DeleteTicketComponent, PrintTicketComponent, ListTicketComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, MaterialModule, HttpClientModule, NgxPaginationModule, Ng2SearchPipeModule,
    FormsModule, MatDialogModule, ReactiveFormsModule, NgxLoadingModule.forRoot({}),
    ChartsModule
  ],
  // tslint:disable-next-line:max-line-length
  providers: [{
    provide: HTTP_INTERCEPTORS,
    useClass: AuthInterceptor,
    multi: true
  }, ExcelService],
  bootstrap: [AppComponent],
  entryComponents: [SpinnerOverlayComponent, TrangChinhComponent, BaoCaoComponentComponent, TrangChuThongKeComponent,
    KetQuaComponent, KetQuaTableComponent, KetQuaSaiLogicComponent]
})
export class AppModule {
}
