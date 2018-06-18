package com.star.demo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class MyWife {

		private String name;
		
		private String sex;
		@JsonIgnore
		private Integer age;
		@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",locale="zh" ,timezone="GMT+8")
		private Date birthday;
		@JsonInclude(Include.NON_NULL)
		private String desc;
		
		
		public MyWife() {
			super();
		}
		public MyWife(String name, String sex, Integer age, Date birthday, String desc) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.birthday = birthday;
			this.desc = desc;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((age == null) ? 0 : age.hashCode());
			result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
			result = prime * result + ((desc == null) ? 0 : desc.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
			MyWife other = (MyWife) obj;
			if (age == null) {
				if (other.age != null)
					return false;
			} else if (!age.equals(other.age))
				return false;
			if (birthday == null) {
				if (other.birthday != null)
					return false;
			} else if (!birthday.equals(other.birthday))
				return false;
			if (desc == null) {
				if (other.desc != null)
					return false;
			} else if (!desc.equals(other.desc))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (sex == null) {
				if (other.sex != null)
					return false;
			} else if (!sex.equals(other.sex))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "MyWife [name=" + name + ", sex=" + sex + ", age=" + age + ", birthday=" + birthday + ", desc="
					+ desc + "]";
		}
		

}
