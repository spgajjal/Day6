package com.capgemini.domain;

public class Television1 {
	public Television1() {
	}
	
		String company;
		String type;
		int enabled;
		double price;
		public Television1(String company, String type, int enabled, double price) {
			super();
			this.company = company;
			this.type = type;
			this.enabled = enabled;
			this.price = price;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((company == null) ? 0 : company.hashCode());
			result = prime * result + enabled;
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			Television1 other = (Television1) obj;
			if (company == null) {
				if (other.company != null)
					return false;
			} else if (!company.equals(other.company))
				return false;
			if (enabled != other.enabled)
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		
}
