package com.mightybird.designpattern.creational.abstractfactory.factories;

import com.mightybird.designpattern.creational.abstractfactory.controllers.InterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.OperationController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.WindowsMobileInterfaceController;
import com.mightybird.designpattern.creational.abstractfactory.controllers.WindowsMobileOperationController;

public class WindowsMobileControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new WindowsMobileOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsMobileInterfaceController();
    }
}
