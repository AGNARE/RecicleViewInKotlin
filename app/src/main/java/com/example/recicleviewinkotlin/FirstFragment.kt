package com.example.recicleviewinkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import com.example.recicleviewinkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: MenuAdapter
    private var arrayList: ArrayList<ModelMenu> = ArrayList()

    private  var name: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData()

    }

    private fun addData() {
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        arrayList.add(
            ModelMenu(
                "dslgjh",
                "dslghds;jgkjdsgn;erhgo;ue",
                340,
                R.drawable.ic_launcher_background
            )
        )
        adapter = MenuAdapter(arrayList, this::onClick)
        binding.recycleView.adapter = adapter
    }

    private fun onClick(modelMenu: ModelMenu) {
        val bundle = Bundle()
        bundle.putSerializable("key", modelMenu)
        val secondFragment = SecondFragment()
        secondFragment.arguments = bundle
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, secondFragment)
            .addToBackStack(null)
            .commit()
    }
}