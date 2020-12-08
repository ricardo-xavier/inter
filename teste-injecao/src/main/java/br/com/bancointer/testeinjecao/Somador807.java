package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador807")
public class Somador807 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
