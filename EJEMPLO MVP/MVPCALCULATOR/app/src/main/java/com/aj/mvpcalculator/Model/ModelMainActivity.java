package com.aj.mvpcalculator.Model;

import com.aj.mvpcalculator.Interfaces.InterfacesMainActivity;

public class ModelMainActivity implements InterfacesMainActivity.Model {
     InterfacesMainActivity.Presenter presenter;

    public ModelMainActivity(InterfacesMainActivity.Presenter presenter){
this.presenter = presenter;
    }

    @Override
    public void addition(int first_number, int second_number) {

        this.presenter.send_result_operation(first_number + second_number);
    }

    @Override
    public void subtraction(int first_number, int second_number) {
        this.presenter.send_result_operation(first_number - second_number);
    }

    @Override
    public void multiplication(int first_number, int second_number) {
        this.presenter.send_result_operation(first_number * second_number);
    }

    @Override
    public void division(int first_number, int second_number) {
        this.presenter.send_result_operation(first_number / second_number);
    }
}
