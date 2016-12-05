package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CardPaymentActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.ChangePasswordActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CheckpointActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CreateTourActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.CreateUserActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.EditUserActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.LoginActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MainPageActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MessagesActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.MyToursActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.OrderActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.PaymentOptionsActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.SearchActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.SearchResultsActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.TourProfileActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.UserProfileActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.components.activitysubcomponents.WishlistActivitySubcomponent;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.ServiceModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.UserModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CardPaymentActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.ChangePasswordActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CheckpointActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CreateTourActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.CreateUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.EditUserActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.LoginActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.MainPageActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.MessagesActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.MyToursActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.OrderActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.PaymentOptionsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.SearchActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.SearchResultsActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.TourProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.UserProfileActivityModule;
import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodulestemp.WishlistActivityModule;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.SearchResultsActivity;

import dagger.Subcomponent;

/**
 * @Author J. Pichardo on 11/11/2016.
 */
@Subcomponent( modules = { UserModule.class, ServiceModule.class } )
public interface UserSubcomponent {

    CardPaymentActivitySubcomponent plus( CardPaymentActivityModule module );

    ChangePasswordActivitySubcomponent plus( ChangePasswordActivityModule module );

    CheckpointActivitySubcomponent plus( CheckpointActivityModule module );

    CreateTourActivitySubcomponent plus( CreateTourActivityModule module );

    CreateUserActivitySubcomponent plus(CreateUserActivityModule module );

    EditUserActivitySubcomponent plus( EditUserActivityModule module );

    MainPageActivitySubcomponent plus(MainPageActivityModule module);

    MessagesActivitySubcomponent plus( MessagesActivityModule module );

    MyToursActivitySubcomponent plus( MyToursActivityModule module );

    OrderActivitySubcomponent plus(OrderActivityModule module);

    PaymentOptionsActivitySubcomponent plus( PaymentOptionsActivityModule module );

    SearchActivitySubcomponent plus( SearchActivityModule module );

    SearchResultsActivitySubcomponent plus(SearchResultsActivityModule module);

    TourProfileActivitySubcomponent plus( TourProfileActivityModule module );

    UserProfileActivitySubcomponent plus( UserProfileActivityModule module );

    WishlistActivitySubcomponent plus( WishlistActivityModule module );

    // TODO: LOGIN??

    LoginActivitySubcomponent plus(LoginActivityModule module);

}
