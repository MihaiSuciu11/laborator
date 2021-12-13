import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class TestClass {	
	public static void main(String[] args) {
		/*DataManager dataManager = new DataManager();
		
		dataManager.gradeStudents();
		dataManager.manager.reportAllCourses();
		dataManager.manager.reportAllStudentsGrades();
		dataManager.manager.reportAllCourses();
		try {
			dataManager.manager.RemoveCurs(new Curs("PLCP 1"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Dupa stergere:");
		dataManager.manager.reportAllCourses();
		
		dataManager.manager.reportAllStudentsGrades();
		
		try {
			dataManager.manager.EditCurs(new Curs("Limba engleza"), new Curs("Limba engleza II", "descriere", new Profesor("Ana", "Maria"), dataManager.createRandomSetOfStudents()));
			dataManager.manager.reportAllCourses();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		//definire studenti
				Set<Student> studenti = new HashSet<Student>();		
				studenti.add(new Student("Andrei", "Dragomir", 3987));
				studenti.add(new Student("Ruxandra", "Danciu", 3590));
				studenti.add(new Student("Alex", "Gaurila", 4777));
				studenti.add(new Student("Grigore", "Dima", 9648));
				studenti.add(new Student("Mihai", "Suciu", 9648));
				studenti.add(new Student("Vlad", "Pascu", 9648));
				studenti.add(new Student("Emanuel", "Ganea", 4777));
				
				//definire profesor
				Profesor prof = new Profesor("Panaitescu","Anton");
				Profesor profpj = new Profesor("Angel", "Cataron");
				Profesor profss = new Profesor("Serban", "Oprisescu");
				Profesor profde = new Profesor("Pana", "Gheorghe");
				Profesor profeng = new Profesor("Sasu", "Elena");
				
				//definire curs nou
				Curs curs = new Curs("Rezistenta Materialelor", "RM", prof, studenti);
				Curs curspj = new Curs("Programare Java", "PJ", profpj, studenti);
				Curs cursss = new Curs("Sisteme si Semnale", "SS", profss, studenti);
				Curs cursde = new Curs("Dispozitive Electronice", "DE", profde, studenti);
				Curs cursengleza = new Curs("Engleza", "Eng", profeng, studenti);
				
				ManagerCursuri cursuri = new ManagerCursuri();
				cursuri.AddCurs(curs);
				cursuri.AddCurs(curspj);
				cursuri.AddCurs(cursss);
				cursuri.AddCurs(cursde);
				cursuri.AddCurs(cursengleza);
				cursuri.reportAllCourses();
				
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\nAfisarea ordonata a studentilor:\n");
				curs.AfiseazaStudentiOrdonat();
				
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\nAfisarea ordonata a cursurilor:\n");
				cursuri.AfiseazaCursuriOrdonat();
				
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\nGruparea studentilor dupa grupa:");
				
				List<Student> studentilist = new ArrayList<Student>(studenti);
				
				HashMap<Integer, ArrayList<Student>> grupareStudenti = new HashMap<Integer, ArrayList<Student>>();
				int j = 0;
				for(int i = 0; i < studenti.size(); i++) {
					ArrayList<Student> studentiGrupati = new ArrayList<Student>();
					studentiGrupati.add(studentilist.get(i));
					int grupa = studentilist.get(i).grupa;
					for(j = i + 1; j < studentilist.size(); j++) {
						if(studentilist.get(i).compareTo(studentilist.get(j)) == 0) {
							studentiGrupati.add(studentilist.get(j));
						} else {
							i = j - 1;
							grupareStudenti.put(grupa, studentiGrupati);
							break;
							}
							
						}
					if(j >= studenti.size() && studentiGrupati.size() != 0) {
						grupareStudenti.put(grupa, studentiGrupati);
						}
					}
				
				for(Integer grupa : grupareStudenti.keySet()) {
					ArrayList<Student> studentiGrupati = grupareStudenti.get(grupa);
					for(Student s : studentiGrupati) {
						System.out.println(s);
					}
				}
				
				}
				
				
	}
