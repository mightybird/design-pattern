package com.mightybird.designpattern.creational.abstractfactory.factories;

import com.mightybird.designpattern.creational.abstractfactory.controllers.InterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.OperationController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.SymbianInterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.SymbianOperationController;

public class SymbianControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
