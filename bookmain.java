/*
 * 
 * attributes : title, author, number of pages, chapters-pages, 
 * methods : number of pages per chapter
 * 
 * 
 * 
 */

class book{
    String title,author;
    int numPages,totalchapters;//number of pages//total number of chapters 
    int i=0;
    String [] chapters ;
    int [] pages ;
    


    book(String title,String author,int numPages,int totalchapters){
            this.title=title;
            this.author=author;
            this.numPages=numPages;
            this.totalchapters=totalchapters;
            this.chapters = new String[this.totalchapters];
            this.pages = new int[this.totalchapters];

    }

   
        
    public void chapter(String chapter,int numPages){
        
        this.chapters[i]=chapter;
        this.pages[i]=numPages;
        i++;
         
    }

    public void  chapterpages(String chapter){

        for(int i=0;i<this.totalchapters;i++){
            if(this.chapters[i].equals(chapter)){
                System.out.printf("\nTotal pages of chapter %s: %d",this.chapters[i],this.pages[i]);
                return ;
            }
        }

    }
}






public class bookmain {

    public static void main(String [] args) {
        book RichDadPoorDad = new  book("RDPR","richard",300,5);
        RichDadPoorDad.chapter("1",70);
        RichDadPoorDad.chapter("2",30);
        RichDadPoorDad.chapter("3",100);
        RichDadPoorDad.chapter("4",60);
        RichDadPoorDad.chapter("5",40);

        


        book ThinkAndGrowRich = new  book("TNGR","Paul",500,5);
        ThinkAndGrowRich.chapter("1",100);
        ThinkAndGrowRich.chapter("2",100);
        ThinkAndGrowRich.chapter("3",200);
        ThinkAndGrowRich.chapter("4",60);
        ThinkAndGrowRich.chapter("5",40);

        ThinkAndGrowRich.chapterpages("3");
        RichDadPoorDad.chapterpages("2");
        
    }
    
}



