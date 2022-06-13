package com.myapplication.introspection.di;


import com.myapplication.introspection.model.CountriesApi;
import com.myapplication.introspection.model.CountriesService;
import com.myapplication.introspection.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
