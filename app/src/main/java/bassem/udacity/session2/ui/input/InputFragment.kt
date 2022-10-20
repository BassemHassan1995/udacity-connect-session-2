package bassem.udacity.session2.ui.input

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import bassem.udacity.session2.User
import bassem.udacity.session2.databinding.FragmentInputBinding
import bassem.udacity.session2.ui.SharedViewModel

class InputFragment : Fragment() {

    private lateinit var binding: FragmentInputBinding
    private val viewModel by activityViewModels<SharedViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInputBinding.inflate(inflater)
        observeUserInput()

        binding.user = User("Bassem" , 28)

        return binding.root
    }

    private fun observeUserInput() {
        viewModel.navigateToWeight.observe(viewLifecycleOwner) {

            if (it) {
                findNavController().navigate(
                    directions = InputFragmentDirections.actionInputFragmentToWeightFragment()
                )
            }
        }
    }


}