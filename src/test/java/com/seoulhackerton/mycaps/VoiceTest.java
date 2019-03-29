package com.seoulhackerton.mycaps;

import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

public class VoiceTest {

    /**
     * @param args Arguments are ignored in this sample.
     */
//    public static void main(String[] args) {
//        try {
//            // Replace below with your own subscription key
//            String speechSubscriptionKey = "f2115a242ba341038168f438b3078919";
//            // Replace below with your own service region (e.g., "westus").
//            String serviceRegion = "YourServiceRegion";
//
//            int exitCode = 1;
//            SpeechConfig config = SpeechConfig.fromSubscription(speechSubscriptionKey, serviceRegion);
//            assert (config != null);
//
//            SpeechRecognizer reco = new SpeechRecognizer(config);
//            assert (reco != null);
//
//            System.out.println("Say something...");
//
//            Future<SpeechRecognitionResult> task = reco.recognizeOnceAsync();
//            assert (task != null);
//
//            SpeechRecognitionResult result = task.get();
//            assert (result != null);
//
//            if (result.getReason() == ResultReason.RecognizedSpeech) {
//                System.out.println("We recognized: " + result.getText());
//                exitCode = 0;
//            } else if (result.getReason() == ResultReason.NoMatch) {
//                System.out.println("NOMATCH: Speech could not be recognized.");
//            } else if (result.getReason() == ResultReason.Canceled) {
//                CancellationDetails cancellation = CancellationDetails.fromResult(result);
//                System.out.println("CANCELED: Reason=" + cancellation.getReason());
//
//                if (cancellation.getReason() == CancellationReason.Error) {
//                    System.out.println("CANCELED: ErrorCode=" + cancellation.getErrorCode());
//                    System.out.println("CANCELED: ErrorDetails=" + cancellation.getErrorDetails());
//                    System.out.println("CANCELED: Did you update the subscription info?");
//                }
//            }
//
//            reco.close();
//
//            System.exit(exitCode);
//        } catch (Exception ex) {
//            System.out.println("Unexpected exception: " + ex.getMessage());
//
//            assert (false);
//            System.exit(1);
//        }
//    }
    public static void main(String[] args) throws InterruptedException, ExecutionException, FileNotFoundException {
         SpeechRecognitionSamples.recognitionWithAudioStreamAsync();
    }
}
