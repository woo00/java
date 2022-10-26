package day08;

public class Pp {

	public Pp() {
		Object[] sha = new Object[5];
		
		for(int i = 0 ; i < 5 ; i ++) {
			
			int no = (int)(Math.random()*3);
			switch(no) {
			case 0 :
				Won cir = new Won();
				cir.ban = (int)(Math.random()*10+1);
				cir.setDoole();
				cir.setArea();
				sha[i]=cir;
			break;
			case 1 :
				Semo tri = new Semo();
				tri.garo = (int)(Math.random()*10+1);
				tri.sero = (int)(Math.random()*10+1);
				tri.setArea();
				sha[i]=tri;
			break;
			case 2 :
				Nemo squ = new Nemo();
				squ.garo = (int)(Math.random()*10+1);
				squ.sero = (int)(Math.random()*10+1);
				squ.setArea();
				sha[i]=squ;
			break;
			}
		}
			for(int i = 0 ; i < sha.length -1 ; i ++) {
				for(int j=i+1 ; j <sha.length ; j++) {
					
					double area1 = 0;
					if(sha[i] instanceof Won) {
						area1 = ((Won)sha[i]).area;
					}else if(sha[i] instanceof Semo) {
						area1 = ((Semo)sha[i]).area;
					}else if(sha[i] instanceof Nemo) {
						area1 = ((Nemo)sha[i]).area;
					}
					double area2 = 0;
					if(sha[j] instanceof Won) {
						area2 = ((Won)sha[j]).area;
					}else if(sha[j] instanceof Semo) {
						area2 = ((Semo)sha[j]).area;
					}else if(sha[j] instanceof Nemo) {
						area2 = ((Nemo)sha[j]).area;
					}
					
					if(area1 < area2) {
						Object tmp = sha[i];
						sha[i]=sha[j];
						sha[j]=tmp;
					}
				}
			}
			
		
		
		
			for(int i = 0 ; i < sha.length ; i++) {
				Object obj = sha[i];
				if(obj instanceof Won) {
					System.out.println("동그라미" + ((Won)obj).area);
				}else if(obj instanceof Semo) {
					System.out.println("세모" + ((Semo)obj).area);
				}else if(obj instanceof Nemo) {
					System.out.println("네모" + ((Nemo)obj).area);
				}
		}
	}
	public static void main(String[] args) {
		new Pp();
	}

}
