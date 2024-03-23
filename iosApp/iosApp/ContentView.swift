import UIKit
import SwiftUI
import ComposeApp
import AVFoundation

var audioPlayer : AVAudioPlayer?

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        @UIApplicationDelegateAdaptor var appDelegate: AppDelegate
        VStack{
            VStack{
                ComposeView()
                    .ignoresSafeArea(.keyboard)
            }.onAppear(perform:playSound)
        }
    }
         // Compose has own keyboard handler
}

func playSound(){
     
       //getting the resource path
       let resourcePath = Bundle.main.url(forResource: "ccommerce_game_audio_mvp", withExtension: "mp3")
       
       do{
           //initializing the audio player with the resource path
           audioPlayer = try AVAudioPlayer(contentsOf: resourcePath!)
           
           //play the audio
           audioPlayer?.play()

          //stop the audio
         // audioPlayer?.stop()
          
    
       }
       catch{
         //error handling
           print(error.localizedDescription)
       }
}

