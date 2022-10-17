package view;

public class Student {
		public String name;
		Enum classification;
		public int id;
			
		public Student(int id,String name, Enum classification) {
			super();
			this.name = name;
			this.classification = classification;
			this.id = id;
		}
	
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Enum getClassification() {
			return classification;
		}


		public void setClassification(Enum classification) {
			this.classification = classification;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", classification=" + classification + ", id=" + id + "]";
		}

			
	}

