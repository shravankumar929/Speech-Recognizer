package edu.cmu.sphinx.demo.helloworld;

public class RunCommand{

    public void execute(String resultText) {
            if (resultText.equalsIgnoreCase("reader")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("evince");
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak pdf");
                    // p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("close reader")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e evince");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing pdf");
                    // p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("settings")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("unity-control-center");
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak settings");
                    // p1.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("close settings")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e unity-control-center");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing settings");
                    //p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("image")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("eog");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak image");
                    // p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("close image")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e eog");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing pdf");
                    // p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("browser")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("firefox");
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak opening firefox");
                    //p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("close browser")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e firefox");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing firefox");
                    //p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("System Monitor")) {
                try {
                    // System.out.println("Im System monitor");
                    Process p;
                    p = Runtime.getRuntime().exec("sudo gnome-system-monitor");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak Systemmonitor");
                    //p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("close System Monitor")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e gnome-system-monitor");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing System monitor");
                    //p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("player")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("vlc");
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak player");
                    // p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("close player")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e vlc");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing vlc");
                    //p1.destroy();
                } catch (Exception er) {
                }

            } else if (resultText.equalsIgnoreCase("Text Editor")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("gedit");
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak opening Gedit");
                    // p1.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("close text editor")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e gedit");
                    p.destroy();
                    Process p1;
                    p1 = Runtime.getRuntime().exec("espeak closing gedit");
                    // p1.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("Calculator")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("gnome-calculator");
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("close calculator")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e gnome-calculator");
                    p.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("Screen shot")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("gnome-screenshot");
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("close screen shot")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e gnome-screenshot");
                    p.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("Sublime Text")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("/opt/sublime_text/sublime_text");
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("close sublime text")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e /opt/sublime_text/sublime_text");
                    p.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("Terminal")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("gnome-terminal");
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("close terminal")) {
                try {
                    Process p;
                    p = Runtime.getRuntime().exec("killall -e gnome-terminal");
                    p.destroy();
                } catch (Exception er) {
                }
            } else if (resultText.equalsIgnoreCase("exit")) {
               // System.exit(0);
            }

            System.out.println("You said: " + resultText + '\n');
            //jTextArea1.append("You said: " + resultText + "\n");
    }
}
