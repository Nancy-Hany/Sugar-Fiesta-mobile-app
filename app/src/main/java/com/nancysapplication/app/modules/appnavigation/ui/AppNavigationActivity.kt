package com.nancysapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.nancysapplication.app.R
import com.nancysapplication.app.appcomponents.base.BaseActivity
import com.nancysapplication.app.databinding.ActivityAppNavigationBinding
import com.nancysapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.nancysapplication.app.modules.cart.ui.CartActivity
import com.nancysapplication.app.modules.div.ui.DivActivity
import com.nancysapplication.app.modules.divfive.ui.DivFiveActivity
import com.nancysapplication.app.modules.divfour.ui.DivFourActivity
import com.nancysapplication.app.modules.divone.ui.DivOneActivity
import com.nancysapplication.app.modules.divthree.ui.DivThreeActivity
import com.nancysapplication.app.modules.divtwo.ui.DivTwoActivity
import com.nancysapplication.app.modules.form.ui.FormActivity
import com.nancysapplication.app.modules.game.ui.GameActivity
import com.nancysapplication.app.modules.home.ui.HomeActivity
import com.nancysapplication.app.modules.home2.ui.Home2Activity
import com.nancysapplication.app.modules.homeone.ui.HomeOneActivity
import com.nancysapplication.app.modules.login.ui.LoginActivity
import com.nancysapplication.app.modules.loginone.ui.LoginOneActivity
import com.nancysapplication.app.modules.main.ui.MainActivity
import com.nancysapplication.app.modules.menubar.ui.MenubarActivity
import com.nancysapplication.app.modules.onboarding.ui.OnboardingActivity
import com.nancysapplication.app.modules.onboardingone.ui.OnBoardingOneActivity
import com.nancysapplication.app.modules.selected.ui.SelectedActivity
import com.nancysapplication.app.modules.signup.ui.SignupActivity
import com.nancysapplication.app.modules.signupone.ui.SignupOneActivity
import com.nancysapplication.app.modules.signuptwo.ui.SignupTwoActivity
import com.nancysapplication.app.modules.splash.ui.SplashActivity
import com.nancysapplication.app.modules.splashone.ui.SplashOneActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGame.setOnClickListener {
      val destIntent = GameActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDivFour.setOnClickListener {
      val destIntent = DivFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDivThree.setOnClickListener {
      val destIntent = DivThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMenubar.setOnClickListener {
      val destIntent = MenubarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUpTwo.setOnClickListener {
      val destIntent = SignupTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginOne.setOnClickListener {
      val destIntent = LoginOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboarding.setOnClickListener {
      val destIntent = OnboardingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear11Home.setOnClickListener {
      val destIntent = Home2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDiv.setOnClickListener {
      val destIntent = DivActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMain.setOnClickListener {
      val destIntent = MainActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignupOne.setOnClickListener {
      val destIntent = SignupOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashOne.setOnClickListener {
      val destIntent = SplashOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnBoardingOne.setOnClickListener {
      val destIntent = OnBoardingOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear11HomeOne.setOnClickListener {
      val destIntent = HomeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForm.setOnClickListener {
      val destIntent = FormActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDivOne.setOnClickListener {
      val destIntent = DivOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDivFive.setOnClickListener {
      val destIntent = DivFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDivTwo.setOnClickListener {
      val destIntent = DivTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSelected.setOnClickListener {
      val destIntent = SelectedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
