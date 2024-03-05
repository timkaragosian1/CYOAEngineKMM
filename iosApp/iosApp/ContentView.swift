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
        VStack{
                  
                    Text("Wind Chime is playing").fontWeight(.heavy)
                }
                .onAppear(perform: playSound)
        
        ComposeView()
                .ignoresSafeArea(.keyboard) // Compose has own keyboard handler
    }
}

func playSound(){
     
       //getting the resource path
       let resourcePath = Bundle.main.url(forResource: "ObservingTheStar", withExtension: "mp3")
       
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