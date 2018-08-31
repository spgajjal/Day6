package com.capgemini.domain;

public class Car1 {
	public Car1() {
	}
		String make;
		String model;
		int year;
		double price;
		public Car1(String make, String model, int year, double price) {
			super();
			this.make = make;
			this.model = model;
			this.year = year;
			this.price = price;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((make == null) ? 0 : make.hashCode());
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + year;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Car1 other = (Car1) obj;
			if (make == null) {
				if (other.make != null)
					return false;
			} else if (!make.equals(other.make))
				return false;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (year != other.year)
				return false;
			return true;
		}
		

}
