package entities;


public class UserCode {
	
	private Integer usercode;
	
	public UserCode(Integer usercode) {
		this.usercode = usercode;
	}

	public Integer getUsercode() {
		return usercode;
	}

	public void setUsername(Integer usercode) {
		this.usercode = usercode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usercode == null) ? 0 : usercode.hashCode());
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
		UserCode other = (UserCode) obj;
		if (usercode == null) {
			if (other.usercode != null)
				return false;
		} else if (!usercode.equals(other.usercode))
			return false;
		return true;
	}

}
