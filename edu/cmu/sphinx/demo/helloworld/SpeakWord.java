package edu.cmu.sphinx.demo.helloworld;

import javax.speech.Central;
import javax.speech.synthesis.*;
//import com.sun.speech.freetts.Voice;

public class SpeakWord {

    String speaktext;

    public void dospeak(String speak, String voicename) {
        speaktext = speak;
        String voiceName = voicename;
        try {
            // Create a synthesizer for the default speech locale
            //Synthesizer synth = (Synthesizer)EngineManager.createEngine(SynthesizerMode.DEFAULT);
            Synthesizer synth = (Synthesizer)Central.createSynthesizer(null);

            // Get it ready to speak
            synth.allocate();

            // Speak the "Hello world" string
            synth.speak("Hello, world!", null);

            // Clean up - includes waiting for the queue to empty
            synth.deallocate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SpeakWord obj = new SpeakWord();
        obj.dospeak(args[0], "kevin16");
    }

}
/*
 try {
 // Create a synthesizer for the default speech locale
 Synthesizer synth = (Synthesizer)EngineManager.createEngine(SynthesizerMode.DEFAULT);

 // Get it ready to speak
 synth.allocate();

 // Speak the "Hello world" string
 synth.speak("Hello, world!", null);

 // Clean up - includes waiting for the queue to empty
 synth.deallocate();
 } 
 catch (Exception e) {
 e.printStackTrace();
 }
 */
/*
 try {
 SynthesizerModeDesc desc = new SynthesizerModeDesc(null,"general",Locale.US, null, null);
 Synthesizer synthesizer=Central.createSynthesizer(desc);
 synthesizer.allocate();
 synthesizer.resume();
 desc = (SynthesizerModeDesc) synthesizer.getEngineModeDesc();
 Voice[] voices = desc.getVoices();
 Voice voice = null;
 for (int i = 0; i < voices.length; i++) {
 if (voices[i].getName().equals(voiceName)) {
 voice = voices[i];
 break;
 }
 }
 synthesizer.getSynthesizerProperties().setVoice(voice);
 synthesizer.speakPlainText(speaktext, null);
 synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
 synthesizer.deallocate();
 } catch (Exception e) {
 String message = " missing speech.properties in " + System.getProperty("user.home") + "\n";
 System.out.println("" + e);
 System.out.println(message);
 }
 */
