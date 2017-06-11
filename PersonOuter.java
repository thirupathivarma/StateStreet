package com.statestr;

import java.util.HashMap;
import java.util.Map;

public class PersonOuter {

	 Map<Integer, PersonInner> persons = new HashMap<Integer, PersonInner>();

	private class PersonInner {
		private int id;
		private String name;
		private String address;
		private String phone;
		
		PersonInner(int id, String name, String phone, String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}

		public String toString() {
			return "id:" + id + " name:" + name + " address:" + address + " phone:" + phone;
		}
	
	}

	public PersonInner getPersons(int id) {
		return persons.get(id);
	}

	public void addPersons(PersonInner person) {
		this.persons.put(person.id, person);
	}

	public static void main(String[] args) {
		PersonOuter pTable = new PersonOuter();
		PersonOuter.PersonInner person1 = pTable.new PersonInner(1, "p1", "ph1", "add1");
		pTable.addPersons(person1);

		PersonOuter.PersonInner person2 = pTable.new PersonInner(2, "p2", "ph2", "add2");
		pTable.addPersons(person2);

		System.out.println(pTable.getPersons(1));
		System.out.println(pTable.getPersons(2));

	}

}