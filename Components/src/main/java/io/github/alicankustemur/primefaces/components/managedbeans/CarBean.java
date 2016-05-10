package io.github.alicankustemur.primefaces.components.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import io.github.alicankustemur.primefaces.components.domain.Car;

@ManagedBean(name = "carBean")
public class CarBean
{

	private List<Car>	cars;

	private Car			selected;

	public Car getSelected()
	{
		return selected;
	}

	public void setSelected(Car selected)
	{
		this.selected = selected;
	}

	public CarBean()
	{
		cars = new ArrayList<Car>();
		for (int i = 0; i < 10; i++)
		{
			cars.add(new Car("myModel" + i, 2005, "ManufacturerX", "blue"));
		}
	}

	public List<Car> getCars()
	{
		return cars;
	}

	public void setCars(List<Car> cars)
	{
		this.cars = cars;
	}

}
