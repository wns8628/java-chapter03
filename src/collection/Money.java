package collection;

public class Money {
	private int val;
	
	public Money(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Money [val=" + val + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
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
		Money other = (Money) obj;
		if (val != other.val)
			return false;
		return true;
	};
	
	//오버라이드안하면 다들어가지 set에 왜? 주소기반이니깐 
	//그래서 오버라이드해서 원하는식로 들어가게
	
	
}
