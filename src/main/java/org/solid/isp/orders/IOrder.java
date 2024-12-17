package org.solid.isp.orders;

import org.solid.isp.orders.paymentways.ICreditOrder;
import org.solid.isp.orders.paymentways.IInstallmentOrder;
import org.solid.isp.orders.paymentways.IcashOrder;

public interface IOrder extends IcashOrder , IInstallmentOrder, ICreditOrder {
    public void new_method();
}
