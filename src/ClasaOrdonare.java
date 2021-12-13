import java.util.Comparator;

class ClasaOrdonare implements Comparator<Curs> {
	public int compare(Curs curs1, Curs curs2) 
	{
			if (curs1.nume.compareTo(curs2.nume) > 0)
				return 1;
			else if (curs1.nume.compareTo(curs2.nume) < 0)
					return -1; 
				else if(curs1.descriere.compareTo(curs2.descriere) > 0)
						return 1;
					else if(curs1.descriere.compareTo(curs1.descriere) < 0)
							return -1;
						else if(curs1.studenti.size() > curs2.studenti.size())
								return 1;
							else if(curs1.studenti.size() < curs2.studenti.size())
									return -1;
								else return 0;
	}
}

class ClasaOrdonareDupaStudenti implements Comparator<Student> {
	public int compare(Student student1, Student student2) 
	{
			if (student1.nume.compareTo(student2.nume) > 0)
				return 1;
			else if (student1.nume.compareTo(student2.nume) < 0)
					return -1; 
				else if(student1.prenume.compareTo(student2.prenume) > 0)
						return 1;
					else if(student1.prenume.compareTo(student2.prenume) < 0)
							return -1;
						else if(student1.grupa > student2.grupa)
								return 1;
							else if(student1.grupa < student2.grupa)
									return -1;
								else return 0; 
	}
}
